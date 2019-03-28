package cn.itsource.aigou.util;

/**
 *  ajax返回json数据
 */
public class AjaxResult {

    public static void main(String[] args) {
        //在调用set方法后通过this返回当前的AjaxResult对象则可以继续调用set
        AjaxResult ajaxResult = AjaxResult.me().setSuccess(false).setMsg("sout").setObj("asf");
        System.out.println(ajaxResult);
    }
    //状态，默认成功
    private boolean success = true;
    //提示信息，默认为操作成功
    private String msg = "操作成功";
    //返回的参数
    private Object obj = null;

    /*
        静态方法返回当前类对象
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
