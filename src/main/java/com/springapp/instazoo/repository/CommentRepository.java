package com.springapp.instazoo.repository;

import com.springapp.instazoo.entity.Comment;
import com.springapp.instazoo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Optional<Comment> findAllByPost(Post post);
    Optional<Comment> findByPostId(Long commentId, Long userId);
}
