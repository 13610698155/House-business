package com.house.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
public class UploadController {

    @Value("${file.path}")
    private String filePath;
    @Value("${file.domain}")
    private String fileDomain;

    @RequestMapping("upload")
    public Object upload(@RequestParam("file")MultipartFile file){
        Map<String,Object> map=new HashMap<>();
        map.put("result",false);

        String orFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID() + orFilename.substring(orFilename.indexOf("."));
        System.out.println(fileName);
        File newFile=new File(filePath+fileName);

        try {
            file.transferTo(newFile);
            map.put("result",true);
            map.put("fileName",fileName);
            map.put("imgUrl",fileDomain+fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }


}
