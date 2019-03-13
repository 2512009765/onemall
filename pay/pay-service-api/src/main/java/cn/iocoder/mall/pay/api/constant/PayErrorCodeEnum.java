package cn.iocoder.mall.pay.api.constant;

/**
 * 错误码枚举类
 *
 * 管理员系统，使用 1-004-000-000 段
 */
public enum PayErrorCodeEnum {

    // ========== APP 模块 ==========
    PAY_APP_NOT_FOUND(1004000000, "App 不存在"),
    PAY_APP_IS_DISABLE(1004000001, "App 已经被禁用"),

    // ========== TRANSACTION 模块 ==========
    PAY_TRANSACTION_NOT_FOUND(100401000, "支付交易单不存在"),
    PAY_TRANSACTION_STATUS_IS_NOT_WAITING(100401001, "支付交易单不处于待支付"),

    PAY_TRANSACTION_EXTENSION_NOT_FOUND(100401002, "支付交易拓展单不存在"),
    PAY_TRANSACTION_EXTENSION_STATUS_IS_NOT_WAITING(100401003, "支付交易拓展单不处于待支付"),
    ;

    private final int code;
    private final String message;

    PayErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}