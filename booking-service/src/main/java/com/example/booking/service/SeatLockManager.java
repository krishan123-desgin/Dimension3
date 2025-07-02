package com.example.booking.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SeatLockManager {
    private final ConcurrentHashMap<String, Lock> seatLocks = new ConcurrentHashMap<>();

    private SeatLockManager() {}

    private static class Holder {
        private static final SeatLockManager INSTANCE = new SeatLockManager();
    }

    public static SeatLockManager getInstance() {
        return Holder.INSTANCE;
    }

    public boolean lockSeat(String seatKey) {
        Lock lock = seatLocks.computeIfAbsent(seatKey, k -> new ReentrantLock());
        return lock.tryLock();
    }

    public void unlockSeat(String seatKey) {
        Lock lock = seatLocks.get(seatKey);
        if (lock != null && lock.isHeldByCurrentThread()) {
            lock.unlock();
        }
    }
}
