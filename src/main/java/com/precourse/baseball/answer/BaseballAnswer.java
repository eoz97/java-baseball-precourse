package com.precourse.baseball.answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 * ���ھ߱� ���� ���䰪 ���� Ŭ����.
 * ����� : BaseballAnswer answer = new Answer();
 * @author eoz
 * @version 1.0
 */

public class BaseballAnswer {
	private static final int BEGIN_NUMBER = 1;
	private static final int END_NUMBER = 9;
	private static final int BALL_COUNT = 3;
	
	/**
    * ��ǻ�Ͱ� ���Ƿ� ������ 3���� ������ ��� �÷���
    * �ߺ� ������ �����ϱ� ���� Set �ڷᱸ�� ����
    */
	private Set<Integer> answer = new LinkedHashSet<Integer>();
	
	public BaseballAnswer() {

	}

	/**
	* 1~9 ������ �ڿ��� 3���� ���Ƿ� �����Ͽ� ���� �Ѵ�.
	*/
	public void generate() {
		List<Integer> numberCandidates = getNumberCandidates();
				
		pickSomeNumbers(numberCandidates);
	}
	
	private static List<Integer> getNumberCandidates() {
		List<Integer> numberCandidates = new ArrayList<>();
		
		for(int i = BEGIN_NUMBER ; i <= END_NUMBER ; i++) {
			numberCandidates.add(i);
        }
		return numberCandidates;
	}

	private void pickSomeNumbers(List<Integer> numberCandidates) {
		Collections.shuffle(numberCandidates);
		
		for(int i=0;i<BALL_COUNT;i++) {
			this.answer.add(numberCandidates.get(i));
		}
	}
	
	/**
	* ���䰪�� �ٽ� �����Ѵ�.
	*/
	public void shouldReset(boolean doReset) {	
		if(doReset) {
			this.answer.clear();
			this.generate();
		}
	}	
	
	public Set<Integer> getAnswer() {
		return answer;
	}
	
}
