package com.example.administrator.myapplication;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22 0022.
 */

public class Data {

    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : {"company":"EMS","com":"ems","no":"1128840230208","status":"1","list":[{"datetime":"2017-02-01 17:03:26","remark":"朱家角(本部）已收件（揽投员姓名：张恩辉,联系电话:18019796657）【上海市】","zone":""},{"datetime":"2017-02-02 13:08:00","remark":"已离开上海虹桥航站，发往广州航站【上海市】","zone":""},{"datetime":"2017-02-02 16:52:00","remark":"到达广州航站处理中心（经转）【广州市】","zone":""},{"datetime":"2017-02-03 01:30:00","remark":"离开广州市 发往茂名市（经转）【广州市】","zone":""},{"datetime":"2017-02-03 08:14:05","remark":"到达  茂名邮政速递物流公司 处理中心【茂名市】","zone":""},{"datetime":"2017-02-04 01:36:00","remark":"离开广州市 发往茂名市（经转）【广州市】","zone":""},{"datetime":"2017-02-04 06:23:40","remark":"到达  茂名邮政速递物流公司 处理中心【茂名市】","zone":""},{"datetime":"2017-02-04 07:20:46","remark":"离开茂名邮政速递物流公司 发往茂名市邮政速递物流公司河西速递揽投站【茂名市】","zone":""},{"datetime":"2017-02-04 09:16:54","remark":"茂名市邮政速递物流公司河西速递揽投站安排投递，预计23:59:00前投递（投递员姓名：刘春成;联系电话：18902518100）【茂名市】","zone":""},{"datetime":"2017-02-04 17:32:00","remark":"投递并签收，签收人：本人收【茂名市】","zone":""}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * company : EMS
     * com : ems
     * no : 1128840230208
     * status : 1
     * list : [{"datetime":"2017-02-01 17:03:26","remark":"朱家角(本部）已收件（揽投员姓名：张恩辉,联系电话:18019796657）【上海市】","zone":""},{"datetime":"2017-02-02 13:08:00","remark":"已离开上海虹桥航站，发往广州航站【上海市】","zone":""},{"datetime":"2017-02-02 16:52:00","remark":"到达广州航站处理中心（经转）【广州市】","zone":""},{"datetime":"2017-02-03 01:30:00","remark":"离开广州市 发往茂名市（经转）【广州市】","zone":""},{"datetime":"2017-02-03 08:14:05","remark":"到达  茂名邮政速递物流公司 处理中心【茂名市】","zone":""},{"datetime":"2017-02-04 01:36:00","remark":"离开广州市 发往茂名市（经转）【广州市】","zone":""},{"datetime":"2017-02-04 06:23:40","remark":"到达  茂名邮政速递物流公司 处理中心【茂名市】","zone":""},{"datetime":"2017-02-04 07:20:46","remark":"离开茂名邮政速递物流公司 发往茂名市邮政速递物流公司河西速递揽投站【茂名市】","zone":""},{"datetime":"2017-02-04 09:16:54","remark":"茂名市邮政速递物流公司河西速递揽投站安排投递，预计23:59:00前投递（投递员姓名：刘春成;联系电话：18902518100）【茂名市】","zone":""},{"datetime":"2017-02-04 17:32:00","remark":"投递并签收，签收人：本人收【茂名市】","zone":""}]
     */

    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String company;
        private String com;
        private String no;
        private String status;
        /**
         * datetime : 2017-02-01 17:03:26
         * remark : 朱家角(本部）已收件（揽投员姓名：张恩辉,联系电话:18019796657）【上海市】
         * zone :
         */

        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String datetime;
            private String remark;
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
