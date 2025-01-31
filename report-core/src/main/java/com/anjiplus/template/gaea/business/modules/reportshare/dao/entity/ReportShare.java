
package com.anjiplus.template.gaea.business.modules.reportshare.dao.entity;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.anji.plus.gaea.curd.entity.GaeaBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import javax.validation.constraints.*;
import java.util.Date;
/**
* @description 报表分享 entity
* @author Raod
* @date 2021-08-18 13:37:26.663
**/
@TableName(value="gaea_report_share")
@Data
public class ReportShare extends GaeaBaseEntity {
    /** 分享编码，系统生成，默认UUID */
    private String shareCode;

    /** 分享有效期类型，DIC_NAME=SHARE_VAILD */
    private Integer shareValidType;

    /** 分享有效期 */
    private Date shareValidTime;

    /** 分享token */
    private String shareToken;

    /** 分享url */
    private String shareUrl;

    /** 报表编码 */
    private String reportCode;

    /** 0--已禁用 1--已启用  DIC_NAME=ENABLE_FLAG */
    private Integer enableFlag;

    /** 0--未删除 1--已删除 DIC_NAME=DELETE_FLAG */
    private Integer deleteFlag;


}
