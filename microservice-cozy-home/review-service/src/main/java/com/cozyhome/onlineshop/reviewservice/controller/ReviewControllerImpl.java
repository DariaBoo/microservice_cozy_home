package com.cozyhome.onlineshop.reviewservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.basePath}/review")
public class ReviewControllerImpl implements ReviewController{
}
