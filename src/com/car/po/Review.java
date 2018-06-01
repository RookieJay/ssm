package com.car.po;

public class Review {
    private Integer reviewId;

    private String content;

    private String nickname;
    
    private String marks;
    
    private String date;
    
    private Integer id;

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", content=" + content + ", nickname=" + nickname + ", marks=" + marks
				+ ", date=" + date + ", id=" + id + "]";
	}

   
}