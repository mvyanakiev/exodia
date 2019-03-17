package exodia.service;


import exodia.domain.models.serviceModels.DocumentServiceModel;

import java.util.List;

public interface DocumentService {

    DocumentServiceModel scheduleDocument(DocumentServiceModel documentServiceModel);

    DocumentServiceModel findById(String id);

    List<DocumentServiceModel> findAllDocuments();

    boolean printDocumentById(String id);

}
