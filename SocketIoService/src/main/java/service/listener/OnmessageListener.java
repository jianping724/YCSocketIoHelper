package service.listener;

/**
 * 收到消息
 */
public abstract class OnmessageListener {
    public abstract void onMessage(Object... args);

    public boolean needCallBackOnUiThread() {
        return true;
    }
}
