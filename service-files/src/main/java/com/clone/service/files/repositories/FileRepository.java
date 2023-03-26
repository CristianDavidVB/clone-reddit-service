package com.clone.service.files.repositories;

import com.clone.service.files.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
