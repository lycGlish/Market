package com.lyc.common.constant;

/**
 * @author lyc
 * @date 2020/8/14 15:03
 */
public class WareConstant {

    public enum PurchaseStatusEnum{
        CREATE(0,"新建"),ASSIGNED(1,"已分配"),RECEIVE(2,"已领取"),
        FINISH(3,"已完成"),HASERROR(4,"有异常");

        private int code;
        private String msg;

        PurchaseStatusEnum(int code,String msg){
            this.code = code;
            this.msg = msg;
        }


        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

    public enum PurchaseDetailEnum{
        CREATE(0,"新建"),ASSIGNED(1,"已分配"),BUYING(2,"正在采购"),
        FINISH(3,"已完成"),HASERROR(4,"采购失败");

        private int code;
        private String msg;

        PurchaseDetailEnum(int code,String msg){
            this.code = code;
            this.msg = msg;
        }


        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
