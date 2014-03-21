package nl.caliope.onairdesk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OnairdeskResource
{
    public abstract String name();
}
