package learing.springboot.Schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class MyFirstSchedule {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 private Log log = LogFactory.getLog(MyFirstSchedule.class);

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		log.info("现在时间：" + dateFormat.format(new Date()));
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}

	/*
	 * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
	 * 
	 * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
	 * 
	 * @Scheduled(initialDelay=1000, fixedRate=5000)
	 * ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
	 * 
	 * @Scheduled(cron="5 * * * * *") ：通过cron表达式定义规则
	 */
}
