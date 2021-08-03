package com.paltov.springBlog.repo;

import com.paltov.springBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
