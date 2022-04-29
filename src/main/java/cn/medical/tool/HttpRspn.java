package cn.medical.tool;

public class HttpRspn {
    private int resCode;
    private Object resContent;

    public HttpRspn(int resCode,Object resContent){
        this.resCode=resCode;
        this.resContent=resContent;
    }

    public int getResCode() {
        return resCode;
    }

    public Object getResContent() {
        return resContent;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public void setResContent(Object resContent) {
        this.resContent = resContent;
    }
}
