package me.while1cry.backend;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModulithTest {

    @Test
    void verifyModules() {
        ApplicationModules.of(BackendApplication.class).verify();
    }
}
