package com.smartyouth.deviceMicroService.entities;


import java.util.List;

public record RequestSlaves(List<Device> slaves , List<String> listeMatricule) {
}
