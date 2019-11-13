package io.billycoda.battochatto.validators;

import io.billycoda.battochatto.models.Feedback;

public class FeedbackValidator {

    // Declaration
    private Feedback feedback;

    // Constructor
    public FeedbackValidator(Feedback feedback) {
        this.feedback = feedback;
    }

    // Validation method

    /**
     * Pulls in new data and validates by regex
     *
     * @return Validity boolean
     */
    public boolean validData() {
        return (
                feedback.getFeedbackBody() != null &&
                        feedback.getFeedbackBody().matches("^[a-zA-Z0-9\"]+[\\S\\s]*") &&
                        feedback.getFeedbackTitle() != null &&
                        feedback.getFeedbackTitle().matches("^[a-zA-Z0-9\"]+[\\S\\s]*") &&
                        feedback.getUserId() != null &&
                        feedback.getDateSubmitted() != null
        );
    }
}
