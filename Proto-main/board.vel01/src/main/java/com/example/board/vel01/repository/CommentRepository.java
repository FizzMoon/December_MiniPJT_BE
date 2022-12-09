package com.example.board.vel01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.board.vel01.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	Comment findByCommentId(Long id);
	
}