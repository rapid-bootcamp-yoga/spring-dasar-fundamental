package lifeCycle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void start(){
        log.info("Server is started");
    }

    public void stop() {
        log.info("Server has been stop");
    }
}

