package com.hontee.commons.db.entity;

import java.util.Date;

public class Menu {
    private Long id;

    private String name;

    private String title;

    private String description;

    private String url;

    private String groupField;

    private Byte state;

    private Date created;

    private Date lastModified;

    private Long createBy;
    
    private String extParentTitle;
    
    private String extCreateName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	public String getGroupField() {
		return groupField;
	}

	public void setGroupField(String groupField) {
		this.groupField = groupField;
	}

	public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

	public String getExtParentTitle() {
		return extParentTitle;
	}

	public void setExtParentTitle(String extParentTitle) {
		this.extParentTitle = extParentTitle;
	}

	public String getExtCreateName() {
		return extCreateName;
	}

	public void setExtCreateName(String extCreateName) {
		this.extCreateName = extCreateName;
	}
    
}