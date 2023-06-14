import { ImportOperation, Autorisation } from "./ie415schema";
import * as yup from 'yup';

export const IE415Schema = yup.object().shape({
    ImportOperation: ImportOperation,
    Autorisation: Autorisation,
    });