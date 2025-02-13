package Java.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class job_sequencing_problem {
    public static int getMaxProfit(int job[][]) {
        // Sort jobs by profit in descending order
        Arrays.sort(job, Comparator.<int[]>comparingDouble(o -> o[1]).reversed());

        int ans = 0;
        int maxDeadline = -1;

        // Find the maximum deadline
        for (int i = 0; i < job.length; i++) {
            maxDeadline = Math.max(maxDeadline, job[i][0]);
        }

        // Create a boolean array to mark filled slots
        boolean slots[] = new boolean[maxDeadline + 1];

        // Iterate over jobs
        for (int i = 0; i < job.length; i++) {
            // Find the latest available slot before or on the job's deadline
            for (int j = Math.min(maxDeadline, job[i][0]); j > 0; j--) {
                if (!slots[j]) {
                    ans += job[i][1];
                    slots[j] = true;
                    break;
                }
            }
        }
        return ans;
    }

    static class job {
        int deadline;
        int profit;
        int id;

        public job(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        // int jobsinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        int[][] jobsinfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 }, { 2, 5 } };
        System.out.println(getMaxProfit(jobsinfo));

        // ArrayList<job> jobs = new ArrayList<>();
        // for (int i = 0; i < jobsinfo.length; i++) {
        // jobs.add(new job(jobsinfo[i][0], jobsinfo[i][1], i));
        // }

        // Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;
        // for (int i = 0; i < jobs.size(); i++) {
        // job curr = jobs.get(i);
        // if (curr.deadline > time) {
        // seq.add(curr.id);
        // time++;
        // }
        // }

        // System.out.println(seq.size());
    }
}

// import java.util.Arrays;
// import java.util.Comparator;

// class Job {
// int deadline, profit;

// public Job(int deadline, int profit) {
// this.deadline = deadline;
// this.profit = profit;
// }
// }

// public class job_sequencing_problem {
// public static int maximizeProfit(int[][] jobsArray) {
// // Convert the input array to Job objects
// Job[] jobs = new Job[jobsArray.length];
// for (int i = 0; i < jobsArray.length; i++) {
// jobs[i] = new Job(jobsArray[i][0], jobsArray[i][1]);
// }

// // Sort jobs by profit in descending order
// Arrays.sort(jobs, Comparator.comparingInt((Job j) -> j.profit).reversed());

// // Find the maximum deadline to determine the size of the schedule
// int maxDeadline = 0;
// for (Job job : jobs) {
// maxDeadline = Math.max(maxDeadline, job.deadline);
// }

// // Create a time slot array for scheduling
// boolean[] timeSlots = new boolean[maxDeadline];

// // Schedule jobs to maximize profit
// int totalProfit = 0;
// for (int i = 0; i < maxDeadline; i++) {

// }
// for (Job job : jobs) {
// // Find the latest available time slot for this job
// for (int slot = Math.min(maxDeadline, job.deadline) - 1; slot >= 0; slot--) {
// if (!timeSlots[slot]) {
// timeSlots[slot] = true; // Mark this time slot as occupied
// totalProfit += job.profit; // Add job profit to total profit
// break;
// }
// }
// }

// return totalProfit;
// }

// public static void main(String[] args) {
// int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 }, { 2, 5 } };
// System.out.println("Maximum Profit: " + maximizeProfit(jobs));
// }
// }
