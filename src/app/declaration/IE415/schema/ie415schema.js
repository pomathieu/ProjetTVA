// validatation schema for ie415

import * as yup from 'yup';

export const ImportOperation = yup.object().shape({
    LRN: yup
      .string()
      .matches(/^[a-zA-Z0-9]{1,22}$/, "Le numéro de référence interne doit être une chaîne alphanumérique de 1 à 22 caractères.")
      .max(22, "Le numéro de référence interne ne doit pas dépasser 22 caractères.")
      .required("Le numéro de référence interne est obligatoire."),
    declarationType: yup
      .string()
      .matches(/^[a-zA-Z0-9]{1,5}$/, "Le type de déclaration doit être une chaîne alphanumérique de 1 à 5 caractères.")
      .max(5, "Le type de déclaration ne doit pas dépasser 5 caractères.")
      .required("Le type de déclaration est obligatoire."),
    additionalDeclarationType: yup
      .string()
      .matches(/^[a-zA-Z]{1}$/, "Le type de déclaration supplémentaire doit être une chaîne alphabétique d'un caractère.")
      .min(1, "Le type de déclaration supplémentaire doit être d'au moins 1 caractère.")
      .max(1, "Le type de déclaration supplémentaire doit être d'au plus 1 caractère."),
    presentationNotificationEstimatedDateAndTime: yup
      .string()
      .nullable()
      .test(
        "checkFormat",
        "La date d'arrivée prévisionnelle doit être au format YYYY-MM-DDTHH:MM:SS.",
        value => value === "" || /^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}$/.test(value)),
    languageCode: yup
      .string()
      .matches(/^[A-Z]{2}$/, "Le code de la langue doit être une chaîne alphabétique en majuscule de 2 caractères.")
      .min(2, "Le code de la langue doit être une chaîne de 2 caractères.")
      .max(2, "Le code de la langue doit être une chaîne de 2 caractères.")
      .required("Le code de la langue est obligatoire."),
  });


  export const Autorisation = yup.object().shape({
    sequenceNumber: yup
      .string()
      .required("Le numéro de séquence est obligatoire.")
      .matches(
        /^[a-zA-Z0-9]+$/,
        "Le numéro de séquence doit être une chaîne alphanumérique."
      ),
    type: yup
      .string()
      .nullable()
      .test(
        "checkFormat",
        "Le format du type est invalide.",
        value => value === "" || /^[a-zA-Z0-9]{1,4}$/.test(value)
      ),
    referenceNumber: yup
      .string()
      .required("Le numéro de référence de l'autorisation est obligatoire.")
      .matches(
        /^[a-zA-Z0-9]{1,35}$/,
        "Le numéro de référence de l'autorisation doit être une chaîne alphanumérique de 1 à 35 caractères."),
    holderOfTheAuthorisation: yup
      .string()
      .max(17, "Le titulaire de l'autorisation ne doit pas dépasser 17 caractères.")
      .nullable()
      .test(
        "checkFormat",
        "Le format du titulaire de l'autorisation est invalide.",
        value => value === "" || /^[a-zA-Z0-9]{1,17}$/.test(value)),
  });