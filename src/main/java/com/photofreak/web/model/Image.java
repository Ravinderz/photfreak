package com.photofreak.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ImageDetails")
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "IMAGEID")
	public int imageId;
	
	@Column(name="IMAGENAME",nullable=false)
	public String imageName;
	
	@Column(name="IMAGEDESC",nullable=false)
	public String imageDesc;
	
	@Column(name="IMAGEPATH",nullable=false)
	public String imagePath;
	
	@Column(name="IMAGETAG",nullable=false)
	public String imageTag;
	
	@Column(name="IMAGECATEGORY",nullable=false)
	public String imageCategory;
	
	@Column(name="IMAGECONTRIBUTOR",nullable=false)
	public String imageContributor;
	
	@Column(name="IMAGEUPLOADEDTIME",nullable=false)
	public String imageUploadedTime;
	
	@Column(name="IMAGERATING",nullable=false)
	public String imageRating;
	
	
	
	public String getImageDesc() {
		return imageDesc;
	}
	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getImageRating() {
		return imageRating;
	}
	public void setImageRating(String imageRating) {
		this.imageRating = imageRating;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageTag() {
		return imageTag;
	}
	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
	}
	public String getImageCategory() {
		return imageCategory;
	}
	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}
	public String getImageContributor() {
		return imageContributor;
	}
	public void setImageContributor(String imageContributor) {
		this.imageContributor = imageContributor;
	}
	public String getImageUploadedTime() {
		return imageUploadedTime;
	}
	public void setImageUploadedTime(String imageUploadedTime) {
		this.imageUploadedTime = imageUploadedTime;
	}
	
	
}
