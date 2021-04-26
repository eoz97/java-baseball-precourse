package com.precourse.baseball.answer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballAnswerTest {
	private BaseballAnswer answer;
	
	@BeforeEach
	void setup() {
		this.answer = new BaseballAnswer();
	}
	
	@Test
	@DisplayName("���䰪�� �ڸ����� ���ڸ� �̴�.")
	void answerSizeTest() {

		assertThat(answer.getAnswer().size()).isEqualTo(0);
		
		answer.generate();
		
		assertThat(answer.getAnswer().size()).isEqualTo(3);
 
	}
	
	@Test
	@DisplayName("���䰪�� ���� �ߺ����� �ʴ´�.(Set �ڷᱸ���� �ߺ� ��� ����)")
	void answerGenerateSizeTest() {
		
		answer.generate();
		
		assertThat(answer.getAnswer().size()).isEqualTo(3);
 
	}
	
	@Test
	@DisplayName("���䰪�� ��Ҵ� 1~9 ���� �̴�.")
	void answerNumberShouldBe1To9Test() {
		
		answer.generate();
		
		Iterator<Integer> it = answer.getAnswer().iterator();
		while(it.hasNext()) {
			assertThat(it.next()).isBetween(1,9);
		}
	}

	
}
