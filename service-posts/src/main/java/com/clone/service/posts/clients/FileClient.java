package com.clone.service.posts.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "service-files", path = "/api/files")
public interface FIleClient {
}
