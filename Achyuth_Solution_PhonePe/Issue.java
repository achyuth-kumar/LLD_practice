import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public class Issue {


    private String issueId;
    private String transactionID;
    private IssueType issueType;
    private String subject;
    private String description;
    private String customerEmail;
    private IssueStatus status;
    private String assignedAgentEmail;
    private String resolution;



    //    private LocalDateTime createdAt,updatedAt;
    private Instant createdAt,updatedAt;

    public Issue(String transactionID, String transactionId, IssueType type, String subject, String description, String customerEmail) {
        this.issueId= UUID.randomUUID().toString();
        this.transactionID=transactionID=issueId;
        this.subject=subject;
        this.description=description;
        this.customerEmail=customerEmail;
        this.status=IssueStatus.OPEN;
        this.createdAt=java.time.Instant.now();
        this.updatedAt=java.time.Instant.now();
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public void setStatus(IssueStatus status) {
        this.status = status;
    }

    public String getAssignedAgentEmail() {
        return assignedAgentEmail;
    }

    public void setAssignedAgentEmail(String assignedAgentEmail) {
        this.assignedAgentEmail = assignedAgentEmail;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
