package io.github.rura6502.github_action_test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GithubActionTestApplicationTest {

	@Test
	void test1() {
		boolean result = GithubActionTestApplication.test(2);

		assertThat(result).isTrue();
	}
}