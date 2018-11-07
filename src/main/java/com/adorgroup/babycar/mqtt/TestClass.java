package com.adorgroup.babycar.mqtt;

import com.adorgroup.babycar.mqtt.util.ThreadPoolManager;

public class TestClass {

    public static void main(String[] args) {

        ThreadPoolManager threadPoolManager = ThreadPoolManager.newInstance();
        for (int i = 0; i < 100; i++) {
            threadPoolManager.addExecuteTask(new MyTask(i));
            System.out.println("线程池中线程数目：" + threadPoolManager.getPoolSize() + "，队列中等待执行的任务数目："
                    + threadPoolManager.getQueue() + "，已执行玩别的任务数目：" + threadPoolManager.getCompletedTaskCount());
        }
        threadPoolManager.shutdown();
    }


}

class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int taskNum) {
        this.taskNum = taskNum;
        ;
    }

    @SuppressWarnings("static-access")
    public void run() {
        System.out.println("正在执行task " + taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task " + taskNum + "执行完毕");
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }
}
