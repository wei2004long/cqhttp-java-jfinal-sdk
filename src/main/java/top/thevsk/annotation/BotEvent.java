package top.thevsk.annotation;

import top.thevsk.enums.EventType;
import top.thevsk.enums.SubType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BotEvent {
    EventType eventType() default EventType.DEFAULT;

    SubType subType() default SubType.DEFAULT;
}