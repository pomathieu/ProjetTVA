"use client";
import { useForm, FormProvider } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import { IE415Schema } from "./schema/indexschema";
import { onSubmit, onSaveDraft } from "./utils/formHandler";
import { Button, Grid } from "@mui/material";
import "./IE415Form.css";
import { ToastContainer } from 'react-toastify';
import ImportOperationForm from "./components/ImportOperationForm";
import AutorisationForm from "./components/AutorisationForm";


export default function IE415Form() {
    const methods = useForm({
        resolver: yupResolver(IE415Schema),
        mode: "onChange",
        reValidateMode: "onChange",
        criteriaMode: "all",
    });
    const { handleSubmit, formState: { isValid }, reset } = methods;
    
    return (
      <FormProvider {...methods}>
        <form onSubmit={handleSubmit(data => onSubmit(data, reset))}>
          <Grid container spacing={3}>
            <Grid item xs={12} md={6}>
              <ImportOperationForm />
            </Grid>
            <Grid item xs={12} md={6}>
              <AutorisationForm />
            </Grid>
            <Grid item xs={12}>
              <Button variant="contained" color="primary" type="submit" disabled={!isValid}>Submit</Button>
              <Button variant="contained" color="secondary" type="button" onClick={() => onSaveDraft(methods.getValues(), reset)} disabled={isValid} style={{marginLeft: "10px"}}>Save as Draft</Button>
            </Grid>
          </Grid>
        </form>
        <ToastContainer />
      </FormProvider>
    );
}