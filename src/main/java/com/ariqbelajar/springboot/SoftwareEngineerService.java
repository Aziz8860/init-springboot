package com.ariqbelajar.springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final AiService aiService;

    public SoftwareEngineerService(
            SoftwareEngineerRepository softwareEngineerRepository,
            AiService aiService
    ) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.aiService = aiService;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        String prompt = """
                Based on the programming tech stack %s that %s has given,
                provide a full learning path and recommendation for this person.
                Make the answer in one paragraph.
                """.formatted(softwareEngineer.getName(), softwareEngineer.getName());
        String chatRes = aiService.chat(prompt);
        softwareEngineer.setLearningPathRecommendation(chatRes);
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    public void deleteSoftwareEngineer(Integer id) {
        boolean isExists = softwareEngineerRepository.existsById(id);
        if (!isExists) {
            throw new IllegalStateException(id + "not found");
        }
        softwareEngineerRepository.deleteById(id);
    }

    public void updateSoftwareEngineer(Integer id, SoftwareEngineer softwareEngineerNewData) {
        SoftwareEngineer softwareEngineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        id + "not found"
                ));
        softwareEngineer.setName(softwareEngineerNewData.getName());
        softwareEngineer.setTechStack(softwareEngineerNewData.getTechStack());
        softwareEngineerRepository.save(softwareEngineer);
    }
}
