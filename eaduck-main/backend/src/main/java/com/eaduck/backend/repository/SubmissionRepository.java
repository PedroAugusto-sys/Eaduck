package com.eaduck.backend.repository;

import com.eaduck.backend.model.submission.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByTaskId(Long taskId);
    List<Submission> findByStudentId(Long studentId);
} 