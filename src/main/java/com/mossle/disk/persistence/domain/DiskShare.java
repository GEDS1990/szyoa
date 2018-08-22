package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiskShare .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_SHARE")
public class DiskShare implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private DiskInfo diskInfo;

    /** null. */
    private String shareType;

    /** null. */
    private Date shareTime;

    /** null. */
    private String name;

    /** null. */
    private String creator;

    /** null. */
    private String type;

    /** null. */
    private Integer dirType;

    /** null. */
    private Integer countView;

    /** null. */
    private Integer countSave;

    /** null. */
    private Integer countDownload;

    /** null. */
    private String shareCode;

    /** null. */
    private String sharePassword;

    /** . */
    private Set<DiskAcl> diskAcls = new HashSet<DiskAcl>(0);

    public DiskShare() {
    }

    public DiskShare(Long id) {
        this.id = id;
    }

    public DiskShare(Long id, DiskInfo diskInfo, String shareType,
            Date shareTime, String name, String creator, String type,
            Integer dirType, Integer countView, Integer countSave,
            Integer countDownload, String shareCode, String sharePassword,
            Set<DiskAcl> diskAcls) {
        this.id = id;
        this.diskInfo = diskInfo;
        this.shareType = shareType;
        this.shareTime = shareTime;
        this.name = name;
        this.creator = creator;
        this.type = type;
        this.dirType = dirType;
        this.countView = countView;
        this.countSave = countSave;
        this.countDownload = countDownload;
        this.shareCode = shareCode;
        this.sharePassword = sharePassword;
        this.diskAcls = diskAcls;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public DiskInfo getDiskInfo() {
        return this.diskInfo;
    }

    /**
     * @param diskInfo
     *            null.
     */
    public void setDiskInfo(DiskInfo diskInfo) {
        this.diskInfo = diskInfo;
    }

    /** @return null. */
    @Column(name = "SHARE_TYPE", length = 50)
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @param shareType
     *            null.
     */
    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SHARE_TIME", length = 26)
    public Date getShareTime() {
        return this.shareTime;
    }

    /**
     * @param shareTime
     *            null.
     */
    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            null.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 64)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "DIR_TYPE")
    public Integer getDirType() {
        return this.dirType;
    }

    /**
     * @param dirType
     *            null.
     */
    public void setDirType(Integer dirType) {
        this.dirType = dirType;
    }

    /** @return null. */
    @Column(name = "COUNT_VIEW")
    public Integer getCountView() {
        return this.countView;
    }

    /**
     * @param countView
     *            null.
     */
    public void setCountView(Integer countView) {
        this.countView = countView;
    }

    /** @return null. */
    @Column(name = "COUNT_SAVE")
    public Integer getCountSave() {
        return this.countSave;
    }

    /**
     * @param countSave
     *            null.
     */
    public void setCountSave(Integer countSave) {
        this.countSave = countSave;
    }

    /** @return null. */
    @Column(name = "COUNT_DOWNLOAD")
    public Integer getCountDownload() {
        return this.countDownload;
    }

    /**
     * @param countDownload
     *            null.
     */
    public void setCountDownload(Integer countDownload) {
        this.countDownload = countDownload;
    }

    /** @return null. */
    @Column(name = "SHARE_CODE", length = 50)
    public String getShareCode() {
        return this.shareCode;
    }

    /**
     * @param shareCode
     *            null.
     */
    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }

    /** @return null. */
    @Column(name = "SHARE_PASSWORD", length = 50)
    public String getSharePassword() {
        return this.sharePassword;
    }

    /**
     * @param sharePassword
     *            null.
     */
    public void setSharePassword(String sharePassword) {
        this.sharePassword = sharePassword;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diskShare")
    public Set<DiskAcl> getDiskAcls() {
        return this.diskAcls;
    }

    /**
     * @param diskAcls
     *            .
     */
    public void setDiskAcls(Set<DiskAcl> diskAcls) {
        this.diskAcls = diskAcls;
    }
}
