package com.smartdev.entities;


import java.util.List;

public record RequestSlaves(List<Device> slaves , List<String> listeMatricule) {
}
