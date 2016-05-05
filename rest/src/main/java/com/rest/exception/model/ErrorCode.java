package com.rest.exception.model;

/**
 * @author <a href="mailto:lanhuai@gmail.com">Ning Yubin</a>
 * @version $Id$
 */
public abstract class ErrorCode {
    /**
     * I/O错误
     */
    public static final int IO_ERROR = 10000;

    /**
     * 网络错误
     */
    public static final int NETWORK_ERROR = 10001;

    /**
     * OAuth 错误
     */
    public static final int OAUTH_ERROR = 10010;

    /**
     * 参数错误
     */
    public static final int PARAM_ERROR = 10011;

    /**
     * 资源没找到，包括目录与文件
     */
    public static final int RESOURCE_NOT_FOUND = 10020;

    /**
     * 目录没找到
     */
    public static final int FOLDER_NOT_FOUND = 10021;

    /**
     * 文件没找到
     */
    public static final int FILE_NOT_FOUND = 10022;

    /**
     * 摘要没找到
     */
    public static final int DIGEST_NOT_FOUND = 10023;

    /**
     * 资源同名冲突，包括目录与文件
     */
    public static final int RESOURCE_CONFLICT = 10030;

    /**
     * 目录同名冲突
     */
    public static final int FOLDER_CONFLICT = 10031;

    /**
     * 文件同名冲突
     */
    public static final int FILE_CONFLICT = 10032;

    /**
     * 资源没有被修改，包括目录与文件
     */
    public static final int RESOURCE_NOT_MODIFIED = 10033;

    /**
     * 目录没有被修改
     */
    public static final int FOLDER_NOT_MODIFIED = 10034;

    /**
     * 文件没有被修改
     */
    public static final int FILE_NOT_MODIFIED = 10035;

    /**
     * 资源禁止访问，包括目录与文件
     */
    public static final int RESOURCE_FORBIDDEN = 10060;

    /**
     * 目录禁止访问
     */
    public static final int FOLDER_FORBIDDEN = 10061;

    /**
     * 文件禁止访问
     */
    public static final int FILE_FORBIDDEN = 10062;

    /**
     * 总空间已满
     */
    public static final int OVER_STORAGE_QUOTA_TOTAL = 10071;

    /**
     * 非文档空间已满
     */
    public static final int OVER_STORAGE_QUOTA_NON_DOC = 10072;

    /**
     * 单个非文档限制错误
     */
    public static final int OVER_STORAGE_QUOTA_SINGLE_NON_DOC = 10073;

    /**
     * 文件上传错误
     */
    public static final int FILE_UPLOAD_ERROR = 10080;

    /**
     * 存储错误
     */
    public static final int STORAGE_ERROR = 10090;

    /**
     * 数据库错误
     */
    public static final int DATABASE_ERROR = 10091;

}
