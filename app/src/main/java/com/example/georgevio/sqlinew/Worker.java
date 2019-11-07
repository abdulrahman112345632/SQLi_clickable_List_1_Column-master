package com.example.georgevio.sqlinew;

public class Worker {
    private String WorkerName;
    private String WorkerPhone;
    private String WorkerEmail;
    private String WorekerPlace;

    public Worker(String workerName, String workerPhone, String workerEmail, String worekerPlace) {
        WorkerName = workerName;
        WorkerPhone = workerPhone;
        WorkerEmail = workerEmail;
        WorekerPlace = worekerPlace;
    }

    public String getWorkerName() {
        return WorkerName;
    }

    public void setWorkerName(String workerName) {
        WorkerName = workerName;
    }

    public String getWorkerPhone() {
        return WorkerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        WorkerPhone = workerPhone;
    }

    public String getWorkerEmail() {
        return WorkerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        WorkerEmail = workerEmail;
    }

    public String getWorekerPlace() {
        return WorekerPlace;
    }

    public void setWorekerPlace(String worekerPlace) {
        WorekerPlace = worekerPlace;
    }
}
