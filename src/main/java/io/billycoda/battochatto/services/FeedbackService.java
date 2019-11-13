package io.billycoda.battochatto.services;

import io.billycoda.battochatto.models.Feedback;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService {

    ResponseEntity<List<Feedback>> getAllFeedback();

    ResponseEntity<Feedback> getFeedbackById(String id);

    ResponseEntity<List<Feedback>> getFeedbackByUserId(String userId);

    ResponseEntity<String> postFeedback(Feedback feedback);

    ResponseEntity<String> updateFeedback(String id, Feedback feedback);

    ResponseEntity<String> deleteFeedback(String id);
}
