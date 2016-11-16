package com.apptium.project.types;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.resourcemanagement.domain.ProjectSprint;
import com.resourcemanagement.domain.UserStory;

public class ProjectRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer projectIdNew;
	private String projectNameNew;
	private Integer projectTimelineNew;
	private Date projectStartDateNew;
	private Date projectEndDateNew;
	private String projectStatusNew;
	private String projectCompanyNameNew;
	private String projectDescription;
	private String projectStatus;
	private List<UserStory> userstories;
	private List<ProjectSprint> projectSprints;

	public List<ProjectSprint> getProjectSprints() {
		return projectSprints;
	}

	public void setProjectSprints(List<ProjectSprint> projectSprints) {
		this.projectSprints = projectSprints;
	}

	public List<UserStory> getUserstories() {
		return userstories;
	}

	public void setUserstories(List<UserStory> userstories) {
		this.userstories = userstories;
	}

	public void setProjectIdNew(Integer projectIdNew) {
		this.projectIdNew = projectIdNew;
	}

	public Integer getProjectIdNew() {
		return projectIdNew;
	}

	public String getProjectNameNew() {
		return projectNameNew;
	}

	public void setProjectNameNew(String projectNameNew) {
		this.projectNameNew = projectNameNew;
	}

	public Integer getProjectTimelineNew() {
		return projectTimelineNew;
	}

	public void setProjectTimelineNew(Integer projectTimelineNew) {
		this.projectTimelineNew = projectTimelineNew;
	}

	public Date getProjectStartDateNew() {
		return projectStartDateNew;
	}

	public void setProjectStartDateNew(Date projectStartDateNew) {
		this.projectStartDateNew = projectStartDateNew;
	}

	public Date getProjectEndDateNew() {
		return projectEndDateNew;
	}

	public void setProjectEndDateNew(Date projectEndDateNew) {
		this.projectEndDateNew = projectEndDateNew;
	}

	public String getProjectStatusNew() {
		return projectStatusNew;
	}

	public void setProjectStatusNew(String projectStatusNew) {
		this.projectStatusNew = projectStatusNew;
	}

	public String getProjectCompanyNameNew() {
		return projectCompanyNameNew;
	}

	public void setProjectCompanyNameNew(String projectCompanyNameNew) {
		this.projectCompanyNameNew = projectCompanyNameNew;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

}
