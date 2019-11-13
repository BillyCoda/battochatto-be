package io.billycoda.battochatto.models;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "feedback")
public class Feedback {

    // Fields
    @Id
    private String id;
    private String userId;
    @ApiModelProperty(example = "Test Title")
    private String feedbackTitle;
    @ApiModelProperty(example = "Test Complaint")
    private String feedbackBody;
    private Date dateSubmitted;

    // Constructors
    public Feedback() {
    }

    public Feedback(String id, String userId, String feedbackTitle, String feedbackBody, Date dateSubmitted) {
        this.id = id;
        this.userId = userId;
        this.feedbackTitle = feedbackTitle;
        this.feedbackBody = feedbackBody;
        this.dateSubmitted = dateSubmitted;
    }

    public Feedback(String userId, String feedbackTitle, String feedbackBody, Date dateSubmitted) {
        this.userId = userId;
        this.feedbackTitle = feedbackTitle;
        this.feedbackBody = feedbackBody;
        this.dateSubmitted = dateSubmitted;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFeedbackTitle() {
        return feedbackTitle;
    }

    public void setFeedbackTitle(String feedbackTitle) {
        this.feedbackTitle = feedbackTitle;
    }

    public String getFeedbackBody() {
        return feedbackBody;
    }

    public void setFeedbackBody(String feedbackBody) {
        this.feedbackBody = feedbackBody;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }
}
