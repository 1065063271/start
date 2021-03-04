package com.test.mydemo.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * 列表请求
 *
 * @author
 */
public class ListRequest {
    @ApiModelProperty(value = "当前页码", example = "1")
    private Long pageNo;
    @ApiModelProperty(value = "每页条数", example = "10")
    private Long pageSize;
    private String sortField;
    private String sort;

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(final Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(final Long pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(final String sortField) {
        this.sortField = sortField;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(final String sort) {
        this.sort = sort;
    }
}
