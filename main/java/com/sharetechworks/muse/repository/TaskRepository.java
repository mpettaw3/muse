package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findTaskByTitleAndCompanyId(String title, long companyId);
    List<Task> findTaskByCompanyId(long companyId);
}
