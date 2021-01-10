package se.thinkcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VerifyEnvironmentTest {
    @Test
    void should_be_able_to_execute_a_test_case() {
        VerifyEnvironment verifier = new VerifyEnvironment();

        String actual = verifier.mirror("Hello, World!");

        assertThat(actual).isEqualTo("Hello, World!");
    }
}
