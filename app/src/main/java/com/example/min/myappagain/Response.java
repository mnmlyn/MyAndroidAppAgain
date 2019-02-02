package com.example.min.myappagain;

import java.util.List;

public class Response {


    /**
     * response : [{"rid":"1","title":"慵懒可爱的小猫咪桌面壁纸","display_type":1,"image_num":3,"images_url":["http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-001.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-002.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-003.jpg"]},{"rid":"2","title":"angelababy性感吊带白裙写真桌面壁纸","display_type":1,"image_num":3,"images_url":["http://img.ivsky.com/img/bizhi/pre/201812/26/angelababy-001.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/angelababy-002.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/angelababy-003.jpg"]},{"rid":"3","title":"意大利五渔村美丽风景图片","display_type":1,"image_num":3,"images_url":["http://img.ivsky.com/img/tupian/pre/201808/01/cinque_terre-001.jpg","http://img.ivsky.com/img/tupian/pre/201808/01/cinque_terre-002.jpg","http://img.ivsky.com/img/tupian/pre/201808/01/cinque_terre-003.jpg"]}]
     * type : feed
     * status : ok
     */

    private String type;
    private String status;
    private List<ResponseBean> response;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResponseBean> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseBean> response) {
        this.response = response;
    }

    public static class ResponseBean {
        /**
         * rid : 1
         * title : 慵懒可爱的小猫咪桌面壁纸
         * display_type : 1
         * image_num : 3
         * images_url : ["http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-001.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-002.jpg","http://img.ivsky.com/img/bizhi/pre/201812/26/xiaomaomi-003.jpg"]
         */

        private String rid;
        private String title;
        private int display_type;
        private int image_num;
        private List<String> images_url;

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(int display_type) {
            this.display_type = display_type;
        }

        public int getImage_num() {
            return image_num;
        }

        public void setImage_num(int image_num) {
            this.image_num = image_num;
        }

        public List<String> getImages_url() {
            return images_url;
        }

        public void setImages_url(List<String> images_url) {
            this.images_url = images_url;
        }
    }
}
