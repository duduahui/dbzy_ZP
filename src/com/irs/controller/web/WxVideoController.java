package com.irs.controller.web;

import com.irs.util.ResponseUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("wx")
@RestController
public  class WxVideoController {
	@RequestMapping(value = "/upload", headers = "content-type=multipart/form-data")
	public Object upload(String userId, String bgmId, double videoSeconds,
							   int videoWidth, int videoHeight, String desc,
							    MultipartFile files){
//		if(StringUtils.isBlank(userId)) {
//			return ResponseUtil.("用户id不能为空");
//		}
		//保存文件的路径
		String fileSpace = "D:\\";
		//保存到数据库的相对路径
		String uploadPathDB = "\\" + userId + "\\video";
		FileOutputStream fileOutputStream = null;
		InputStream inputStream = null;

		Map<String, Object> resultAll = new HashMap<>();
		resultAll.put("status", 200);

		List<Map<String, Object>> data = new ArrayList<>(3);

		data.add(resultAll);
		try {
			if(files != null ) {
				String fileNmae = files.getOriginalFilename();

				if (StringUtils.isNotBlank(fileNmae)) {
					//文件上传的最终保存路径
					String finalVideoPath = fileSpace + uploadPathDB + "\\" + fileNmae;
					//数据库最终保存的相对路径
					uploadPathDB += ("\\" + fileNmae);

					File outFile = new File(finalVideoPath);
					if (outFile.getParentFile() != null || !outFile.getParentFile().isDirectory()) {
						//创建父类文件夹
						outFile.getParentFile().mkdirs();
					}
					fileOutputStream = new FileOutputStream(outFile);
					inputStream = files.getInputStream();
					IOUtils.copy(inputStream, fileOutputStream);
				}
			} else {
				return  ResponseUtil.fail(502,"上传出错");
			}
		} catch (Exception e) {
			return  ResponseUtil.fail(502,"上传出错");
		} finally {
			try{
				if(fileOutputStream !=null ){
					fileOutputStream.flush();
					fileOutputStream.close();
				}
			} catch(IOException e){
				return  ResponseUtil.fail(502,"上传出错");
			}
		}

		return 0;
	}


}
