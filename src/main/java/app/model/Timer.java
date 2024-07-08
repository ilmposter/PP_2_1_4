package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("timerBean")
public class Timer {

    private Long nanoTime = System.nanoTime();
    public Long getTime() {
        return nanoTime;
    }
}
