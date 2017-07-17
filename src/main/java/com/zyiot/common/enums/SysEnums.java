package com.zyiot.common.enums;

import com.google.common.base.Objects;

/**
 * Created by Administrator on 2017-7-12.
 */
public enum SysEnums {
    ZZCX_URL("zzxc_url", "http://www.jszyiot.com/gongzhonghao/wx/page/zccx"),
    RESPONSE_SUCCESS("1", "返回成功"),
    RESPONSE_FAIL("0", "返回失败"),
    STAT_VALID("1", "有效"),
    STAT_INVALID("0", "无效");
    private String code;
    private String value;

    SysEnums(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static SysEnums find(String code) {
        for (SysEnums sysEnums : SysEnums.values()) {
            if (Objects.equal(sysEnums.getCode(), code)) {
                return sysEnums;
            }
        }
        return null;
    }
}
