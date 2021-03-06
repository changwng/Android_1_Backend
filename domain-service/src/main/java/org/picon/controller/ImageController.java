package org.picon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.picon.dto.ProfileResponse;
import org.picon.s3.S3Uploader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/domain")
@Slf4j
public class ImageController {

    private final S3Uploader s3Uploader;

    @PostMapping("/post/images")
    public List<String> ImagesUpload(@RequestPart("images") MultipartFile[] multipartFiles) throws IOException {
        return s3Uploader.uploadImages(multipartFiles, "picon");
    }

    @PostMapping("/member/image")
    public ProfileResponse ImagUpload(@RequestPart("image") MultipartFile multipartFile) throws IOException {
        return new ProfileResponse(s3Uploader.uploadImage(multipartFile, "picon/profile"));
    }
}
