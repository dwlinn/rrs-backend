package com.example.algorithm;

import java.util.*;


public class GASolution {

    public static Individual generateRandomIndividual(List<Order> orders) {
        List<Integer> genes = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            genes.add(i); // 初始化基因，代表订单的顺序
        }
        Collections.shuffle(genes); // 打乱顺序
        return new Individual(genes);
    }

    public static double calculateFitness(Individual individual, List<Order> orders, int moldSwitchTime) {
        int currentTime = 0;
        Product currentProduct = null;
        int totalProductionTime = 0;
        int totalDelayTime = 0;

        for (int orderIndex : individual.genes) {
            Order order = orders.get(orderIndex);

            // 计算该订单的生产结束时间
            int productEndTime;

            // 如果订单中的产品和当前生产的产品不同，需要切换模具
            if (currentProduct == null || !order.product.name.equals(currentProduct.name)) {
                productEndTime = currentTime + moldSwitchTime;  // 切换模具的时间成本
            } else {
                productEndTime = currentTime;
            }

            productEndTime += order.product.productionTime * order.quantity;

            // 计算超时时间（如果生产结束时间超过截至日期）
            int delay = Math.max(0, productEndTime - order.deadline);
            totalDelayTime += delay;

            // 更新当前时间和产品信息
            currentTime = productEndTime;
            currentProduct = order.product;

            // 记录每个订单的起止时间
            individual.startTimes.add(productEndTime - order.product.productionTime * order.quantity);
            individual.endTimes.add(productEndTime);

            // 累加总生产时间
            totalProductionTime += productEndTime;
        }

        // 计算适应度函数的值（总时间加上超时时间的惩罚）
        // 这里的适应度函数为总时间加上超时时间的惩罚，你可以根据实际需求调整惩罚因子
        double penaltyFactor = 1;  // 惩罚因子，用于控制超时的惩罚程度
        double fitness = totalProductionTime + 5 * totalDelayTime;
        individual.fitness = fitness;

        return fitness;
    }

    public static Individual findBestSolution(List<Order> orders, int moldSwitchTime, int numIterations) {
        Individual bestSolution = null;
        double bestFitness = 10000;

        for (int i = 0; i < 100; i++) {
            Individual randomIndividual = generateRandomIndividual(orders);
            double fitness = calculateFitness(randomIndividual, orders, moldSwitchTime);
            if (fitness < bestFitness) {
                bestFitness = fitness;
                bestSolution = randomIndividual;
            }
        }

        return bestSolution;
    }

    public List<Map<String, Object>> getSolution(List<Order> orders){
        // 随机生成一个生产计划
        Individual randomIndividual = findBestSolution(orders, 1, 100);

        // 计算适应度
        double fitness = calculateFitness(randomIndividual, orders, 1);

        // 输出生产计划和适应度
        List<Map<String, Object>> productionPlan = new ArrayList<>();
        System.out.println("Random Production Plan:");
        for (int i = 0; i < randomIndividual.genes.size(); i++) {
            int orderIndex = randomIndividual.genes.get(i);
            Order order = orders.get(orderIndex);
            Map<String, Object> orderInfo = new HashMap<>();
            orderInfo.put("id", order.orderId);
            orderInfo.put("Product", order.product.name);
            orderInfo.put("Quantity", order.quantity);
            orderInfo.put("Deadline", order.deadline);
            orderInfo.put("StartTime", randomIndividual.startTimes.get(i));
            orderInfo.put("EndTime", randomIndividual.startTimes.get(i));
            productionPlan.add(orderInfo);
            System.out.println("Order ID: " + order.orderId +
                    ", Product: " + order.product.name +
                    ", Quantity: " + order.quantity +
                    ", Deadline: " + order.deadline +
                    ", Start Time: " + randomIndividual.startTimes.get(i) +
                    ", End Time: " + randomIndividual.endTimes.get(i));
        }
        System.out.println("Fitness: " + fitness);
        return productionPlan;
    }
    public static void main(String[] args) {
        // 示例订单和产品
        Product productA = new Product("Product A", 2);
        Product productB = new Product("Product B", 3);

        Order order1 = new Order("1", productA, 2, 30);
        Order order2 = new Order("2", productB, 3, 22);
        Order order3 = new Order("3", productB, 3, 22);

        List<Order> orders = Arrays.asList(order1, order2, order3);

        GASolution ga = new GASolution();
        ga.getSolution(orders);
    }
}