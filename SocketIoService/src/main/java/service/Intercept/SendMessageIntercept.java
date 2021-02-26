package service.Intercept;

import service.socketio.Message.MessageEntity;

/**
 * 发送消息的拦截器
 */
public interface SendMessageIntercept {
    MessageEntity intercept(MessageEntity messageEntity);
}
